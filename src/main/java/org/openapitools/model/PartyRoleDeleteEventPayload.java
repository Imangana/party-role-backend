package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PartyRole;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The event data structure
 */

@Schema(name = "PartyRoleDeleteEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-21T17:10:52.617229+05:30[Asia/Colombo]", comments = "Generator version: 7.13.0")
public class PartyRoleDeleteEventPayload {

  private @Nullable PartyRole partyRole;

  public PartyRoleDeleteEventPayload partyRole(PartyRole partyRole) {
    this.partyRole = partyRole;
    return this;
  }

  /**
   * Get partyRole
   * @return partyRole
   */
  @Valid 
  @Schema(name = "partyRole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partyRole")
  public PartyRole getPartyRole() {
    return partyRole;
  }

  public void setPartyRole(PartyRole partyRole) {
    this.partyRole = partyRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyRoleDeleteEventPayload partyRoleDeleteEventPayload = (PartyRoleDeleteEventPayload) o;
    return Objects.equals(this.partyRole, partyRoleDeleteEventPayload.partyRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRoleDeleteEventPayload {\n");
    sb.append("    partyRole: ").append(toIndentedString(partyRole)).append("\n");
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

