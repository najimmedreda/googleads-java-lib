// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.v201311.customtargetingservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201311.StatementBuilder;
import com.google.api.ads.dfp.axis.v201311.CustomTargetingKey;
import com.google.api.ads.dfp.axis.v201311.CustomTargetingKeyPage;
import com.google.api.ads.dfp.axis.v201311.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example updates a custom targeting key's display name. To determine
 * which custom targeting keys and values exist, run
 * GetAllCustomTargetingKeysAndValue.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CustomTargetingService.getCustomTargetingKeysByStatement
 * Tags: CustomTargetingService.updateCustomTargetingKeys
 *
 * @author Adam Rogal
 */
public class UpdateCustomTargetingKeys {

  // Set the ID of the custom targeting key to update.
  private static final String CUSTOM_TARGETING_KEY_ID = "INSERT_CUSTOM_TARGETING_KEY_ID_HERE";

  public static void runExample(
      DfpServices dfpServices, DfpSession session, long customTargetingKeyId) throws Exception {
    // Get the CustomTargetingService.
    CustomTargetingServiceInterface customTargetingService =
        dfpServices.get(session, CustomTargetingServiceInterface.class);

    // Create a statement to get custom targeting keys.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE id = :id")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("id", customTargetingKeyId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get custom targeting keys by statement.
      CustomTargetingKeyPage page =
          customTargetingService.getCustomTargetingKeysByStatement(
              statementBuilder.toStatement());

      if (page.getResults() != null) {
        CustomTargetingKey[] customTargetingKeys = page.getResults();
        totalResultSetSize = page.getTotalResultSetSize();

        // Update each local custom targeting key object by changing its display
        // name.
        for (CustomTargetingKey customTargetingKey : customTargetingKeys) {
          if (customTargetingKey.getDisplayName() == null) {
            customTargetingKey.setDisplayName(customTargetingKey.getName());
          }
          customTargetingKey.setDisplayName(
              customTargetingKey.getDisplayName() + " (Deprecated)");
        }

        // Update the custom targeting keys on the server.
        customTargetingKeys =
            customTargetingService.updateCustomTargetingKeys(customTargetingKeys);

        for (CustomTargetingKey updatedCustomTargetingKey : customTargetingKeys) {
          System.out.printf("Custom targeting key with ID \"%d\", name \"%s\", and display name "
              + "\"%s\" was updated.\n", updatedCustomTargetingKey.getId(),
              updatedCustomTargetingKey.getName(), updatedCustomTargetingKey.getDisplayName());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session, Long.parseLong(CUSTOM_TARGETING_KEY_ID));
  }
}
