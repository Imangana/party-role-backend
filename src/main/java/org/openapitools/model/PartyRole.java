package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountRef;
import org.openapitools.model.AgreementRef;
import org.openapitools.model.Characteristic;
import org.openapitools.model.ContactMedium;
import org.openapitools.model.CreditProfile;
import org.openapitools.model.PaymentMethodRef;
import org.openapitools.model.RelatedParty;
import org.openapitools.model.TimePeriod;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The part played by a party in a given context.
 */

@Schema(name = "PartyRole", description = "The part played by a party in a given context.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-21T17:10:52.617229+05:30[Asia/Colombo]", comments = "Generator version: 7.13.0")
public class PartyRole {

  private @Nullable String id;

  private @Nullable String href;

  private @Nullable String name;

  private @Nullable String status;

  private @Nullable String statusReason;

  @Valid
  private List<@Valid AccountRef> account = new ArrayList<>();

  @Valid
  private List<@Valid AgreementRef> agreement = new ArrayList<>();

  @Valid
  private List<@Valid Characteristic> characteristic = new ArrayList<>();

  @Valid
  private List<@Valid ContactMedium> contactMedium = new ArrayList<>();

  @Valid
  private List<@Valid CreditProfile> creditProfile = new ArrayList<>();

  private @Nullable RelatedParty engagedParty;

  @Valid
  private List<@Valid PaymentMethodRef> paymentMethod = new ArrayList<>();

  @Valid
  private List<@Valid RelatedParty> relatedParty = new ArrayList<>();

  private @Nullable TimePeriod validFor;

  private @Nullable String atBaseType;

  private @Nullable URI atSchemaLocation;


  private @Nullable String atType;

  public PartyRole id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for PartyRoles
   * @return id
   */
  
  @Schema(name = "id", description = "Unique identifier for PartyRoles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PartyRole href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Url used to reference the party role.
   * @return href
   */
  
  @Schema(name = "href", description = "Url used to reference the party role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PartyRole name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A word, term, or phrase by which the PartyRole is known and distinguished from other PartyRoles.
   * @return name
   */
  
  @Schema(name = "name", description = "A word, term, or phrase by which the PartyRole is known and distinguished from other PartyRoles.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyRole status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Used to track the lifecycle status of the party role.
   * @return status
   */
  
  @Schema(name = "status", description = "Used to track the lifecycle status of the party role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PartyRole statusReason(String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  /**
   * A string providing an explanation on the value of the status lifecycle. For instance if the status is Rejected, statusReason will provide the reason for rejection.
   * @return statusReason
   */
  
  @Schema(name = "statusReason", description = "A string providing an explanation on the value of the status lifecycle. For instance if the status is Rejected, statusReason will provide the reason for rejection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusReason")
  public String getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  public PartyRole account(List<@Valid AccountRef> account) {
    this.account = account;
    return this;
  }

  public PartyRole addAccountItem(AccountRef accountItem) {
    if (this.account == null) {
      this.account = new ArrayList<>();
    }
    this.account.add(accountItem);
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account")
  public List<@Valid AccountRef> getAccount() {
    return account;
  }

  public void setAccount(List<@Valid AccountRef> account) {
    this.account = account;
  }

  public PartyRole agreement(List<@Valid AgreementRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public PartyRole addAgreementItem(AgreementRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<>();
    }
    this.agreement.add(agreementItem);
    return this;
  }

  /**
   * Get agreement
   * @return agreement
   */
  @Valid 
  @Schema(name = "agreement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agreement")
  public List<@Valid AgreementRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(List<@Valid AgreementRef> agreement) {
    this.agreement = agreement;
  }

  public PartyRole characteristic(List<@Valid Characteristic> characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  public PartyRole addCharacteristicItem(Characteristic characteristicItem) {
    if (this.characteristic == null) {
      this.characteristic = new ArrayList<>();
    }
    this.characteristic.add(characteristicItem);
    return this;
  }

  /**
   * Describes the characteristic of a party role.
   * @return characteristic
   */
  @Valid 
  @Schema(name = "characteristic", description = "Describes the characteristic of a party role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("characteristic")
  public List<@Valid Characteristic> getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(List<@Valid Characteristic> characteristic) {
    this.characteristic = characteristic;
  }

  public PartyRole contactMedium(List<@Valid ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
    return this;
  }

  public PartyRole addContactMediumItem(ContactMedium contactMediumItem) {
    if (this.contactMedium == null) {
      this.contactMedium = new ArrayList<>();
    }
    this.contactMedium.add(contactMediumItem);
    return this;
  }

  /**
   * Get contactMedium
   * @return contactMedium
   */
  @Valid 
  @Schema(name = "contactMedium", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactMedium")
  public List<@Valid ContactMedium> getContactMedium() {
    return contactMedium;
  }

  public void setContactMedium(List<@Valid ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
  }

  public PartyRole creditProfile(List<@Valid CreditProfile> creditProfile) {
    this.creditProfile = creditProfile;
    return this;
  }

  public PartyRole addCreditProfileItem(CreditProfile creditProfileItem) {
    if (this.creditProfile == null) {
      this.creditProfile = new ArrayList<>();
    }
    this.creditProfile.add(creditProfileItem);
    return this;
  }

  /**
   * Get creditProfile
   * @return creditProfile
   */
  @Valid 
  @Schema(name = "creditProfile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditProfile")
  public List<@Valid CreditProfile> getCreditProfile() {
    return creditProfile;
  }

  public void setCreditProfile(List<@Valid CreditProfile> creditProfile) {
    this.creditProfile = creditProfile;
  }

  public PartyRole engagedParty(RelatedParty engagedParty) {
    this.engagedParty = engagedParty;
    return this;
  }

  /**
   * Get engagedParty
   * @return engagedParty
   */
  @Valid 
  @Schema(name = "engagedParty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engagedParty")
  public RelatedParty getEngagedParty() {
    return engagedParty;
  }

  public void setEngagedParty(RelatedParty engagedParty) {
    this.engagedParty = engagedParty;
  }

  public PartyRole paymentMethod(List<@Valid PaymentMethodRef> paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  public PartyRole addPaymentMethodItem(PaymentMethodRef paymentMethodItem) {
    if (this.paymentMethod == null) {
      this.paymentMethod = new ArrayList<>();
    }
    this.paymentMethod.add(paymentMethodItem);
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   */
  @Valid 
  @Schema(name = "paymentMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMethod")
  public List<@Valid PaymentMethodRef> getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(List<@Valid PaymentMethodRef> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PartyRole relatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public PartyRole addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
   */
  @Valid 
  @Schema(name = "relatedParty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<@Valid RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public PartyRole validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   */
  @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFor")
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public PartyRole atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
   */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public PartyRole atSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
   */
  @Valid 
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public PartyRole atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return atType
   */
  
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class entity name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyRole partyRole = (PartyRole) o;
    return Objects.equals(this.id, partyRole.id) &&
        Objects.equals(this.href, partyRole.href) &&
        Objects.equals(this.name, partyRole.name) &&
        Objects.equals(this.status, partyRole.status) &&
        Objects.equals(this.statusReason, partyRole.statusReason) &&
        Objects.equals(this.account, partyRole.account) &&
        Objects.equals(this.agreement, partyRole.agreement) &&
        Objects.equals(this.characteristic, partyRole.characteristic) &&
        Objects.equals(this.contactMedium, partyRole.contactMedium) &&
        Objects.equals(this.creditProfile, partyRole.creditProfile) &&
        Objects.equals(this.engagedParty, partyRole.engagedParty) &&
        Objects.equals(this.paymentMethod, partyRole.paymentMethod) &&
        Objects.equals(this.relatedParty, partyRole.relatedParty) &&
        Objects.equals(this.validFor, partyRole.validFor) &&
        Objects.equals(this.atBaseType, partyRole.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyRole.atSchemaLocation) &&
        Objects.equals(this.atType, partyRole.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, status, statusReason, account, agreement, characteristic, contactMedium, creditProfile, engagedParty, paymentMethod, relatedParty, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRole {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
    sb.append("    creditProfile: ").append(toIndentedString(creditProfile)).append("\n");
    sb.append("    engagedParty: ").append(toIndentedString(engagedParty)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

