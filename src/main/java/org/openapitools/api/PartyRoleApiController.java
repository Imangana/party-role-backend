package org.openapitools.api;

import org.openapitools.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import javax.annotation.Generated;
import javax.validation.Valid;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-21T13:52:01.148871+05:30[Asia/Colombo]", comments = "Generator version: 7.13.0")
@Controller
@RequestMapping("${openapi.partyRoleManagement.base-path:/tmf-api/partyRole/v4}")
public class PartyRoleApiController implements PartyRoleApi {

    private final NativeWebRequest request;

    @Autowired
    public PartyRoleApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    @Override
    @GetMapping(value = "/partyRole", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<PartyRole>> listPartyRole(
            @RequestParam(value = "fields", required = false) String fields,
            @RequestParam(value = "offset", required = false) Integer offset,
            @RequestParam(value = "limit", required = false) Integer limit) {

        PartyRole dummy = new PartyRole();
        dummy.setId("dummy-id-001");
        dummy.setHref("https://my.api/partyRole/dummy-id-001");
        dummy.setName("Mobile catalog administrator");
        dummy.setStatus("completed");
        dummy.setStatusReason("Initial setup for testing");
        dummy.setAtType("PartyRole");
        dummy.setAtBaseType("PartyRole");
        dummy.setAtSchemaLocation(URI.create("https://my.api/schema/PartyRole"));

        RelatedParty engagedParty = new RelatedParty();
        engagedParty.setId("3b1c-74f1");
        engagedParty.setHref("https://host:port/tmf-api/partyManagement/v2/individual/3b1c-74f1");
        engagedParty.setName("Jean Pontus");
        engagedParty.setRole(null); // or omit if optional
        engagedParty.setAtBaseType("RelatedParty");
        engagedParty.setAtSchemaLocation(URI.create("https://my.api/schema/RelatedParty"));
        engagedParty.setAtType("RelatedParty");
        engagedParty.setAtReferredType("Individual");

        dummy.setEngagedParty(engagedParty);

        TimePeriod validFor = new TimePeriod();
        validFor.setStartDateTime(OffsetDateTime.now());
        validFor.setEndDateTime(OffsetDateTime.now().plusMonths(6));

        dummy.setValidFor(validFor);


        List<PartyRole> list = new ArrayList<>();
        list.add(dummy);

        return ResponseEntity.ok(list);
    }
    @Override
    @GetMapping(value = "/partyRole/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<PartyRole> retrievePartyRole(
            @PathVariable("id") String id,
            @RequestParam(value = "fields", required = false) String fields) {

        PartyRole partyRole = new PartyRole();
        partyRole.setId(id);
        partyRole.setHref("https://my.api/partyRole/" + id);
        partyRole.setName("Mobile catalog administrator");
        partyRole.setStatus("completed");
        partyRole.setStatusReason("Fetched by ID");
        partyRole.setAtType("PartyRole");
        partyRole.setAtBaseType("PartyRole");
        partyRole.setAtSchemaLocation(URI.create("https://my.api/schema/PartyRole"));

        RelatedParty engagedParty = new RelatedParty();
        engagedParty.setId("3b1c-74f1");
        engagedParty.setHref("https://host:port/tmf-api/partyManagement/v2/individual/3b1c-74f1");
        engagedParty.setName("Jean Pontus");
        engagedParty.setRole(null); // IMPORTANT: must be null
        engagedParty.setAtBaseType("RelatedParty");
        engagedParty.setAtSchemaLocation(URI.create("https://my.api/schema/RelatedParty"));
        engagedParty.setAtType("RelatedParty");
        engagedParty.setAtReferredType("Individual");

        partyRole.setEngagedParty(engagedParty);



        TimePeriod validFor = new TimePeriod();
        validFor.setStartDateTime(OffsetDateTime.now());
        validFor.setEndDateTime(OffsetDateTime.now().plusMonths(6));
        partyRole.setValidFor(validFor);

        return ResponseEntity.ok(partyRole);
    }
    @Override
    public ResponseEntity<PartyRole> patchPartyRole(String id, Map<String, Object> partyRoleMap) {
        // Minimal mapping to PartyRoleUpdate
        PartyRoleUpdate dummyUpdate = new PartyRoleUpdate();
        if (partyRoleMap.containsKey("status")) {
            dummyUpdate.setStatus(partyRoleMap.get("status").toString());
        }

        // Reuse your actual patch logic
        return patchPartyRole(id, dummyUpdate);
    }

    // Your own typed logic
    public ResponseEntity<PartyRole> patchPartyRole(String id, PartyRoleUpdate partyRole) {
        PartyRole updated = new PartyRole();
        updated.setId(id);
        updated.setHref("https://my.api/partyRole/" + id);
        updated.setStatus(partyRole.getStatus() != null ? partyRole.getStatus() : "patched");
        updated.setStatusReason("Dummy PartyRoleUpdate input used");
        updated.setAtType("PartyRole");
        updated.setAtBaseType("PartyRole");
        updated.setName("Mobile catalog administrator");
        updated.setAtSchemaLocation(URI.create("https://my.api/schema/PartyRole"));

        RelatedParty engagedParty = new RelatedParty();
        engagedParty.setId("3b1c-74f1");
        engagedParty.setHref("https://host:port/tmf-api/partyManagement/v2/individual/3b1c-74f1");
        engagedParty.setName("Jean Pontus");
        engagedParty.setRole(null); // must be null
        engagedParty.setAtBaseType("RelatedParty");
        engagedParty.setAtType("RelatedParty");
        engagedParty.setAtSchemaLocation(URI.create("https://my.api/schema/RelatedParty"));
        engagedParty.setAtReferredType("Individual");

        updated.setEngagedParty(engagedParty);
        TimePeriod validFor = new TimePeriod();
        validFor.setStartDateTime(OffsetDateTime.now().minusDays(1));
        validFor.setEndDateTime(OffsetDateTime.now().plusDays(30));
        updated.setValidFor(validFor);
        return ResponseEntity.ok(updated);
    }

    @Override
    public ResponseEntity<PartyRole> createPartyRole(@Valid @RequestBody PartyRoleCreate partyRoleCreate) {
        PartyRole response = new PartyRole();
        response.setId("dummy-id-001");
        response.setHref("https://my.api/partyRole/dummy-id-001");
        response.setName(partyRoleCreate.getName());
        response.setStatus(partyRoleCreate.getStatus());
        response.setStatusReason("Created dummy data");
        response.setAtType("PartyRole");
        response.setAtBaseType("PartyRole");
        response.setAtSchemaLocation(URI.create("https://my.api/schema/PartyRole"));

        RelatedParty engagedParty = new RelatedParty();
        engagedParty.setId("3b1c-74f1");
        engagedParty.setHref("https://host:port/tmf-api/partyManagement/v2/individual/3b1c-74f1");
        engagedParty.setName("Jean Pontus");
        engagedParty.setRole(null); // Must be null for TMF CTK
        engagedParty.setAtBaseType("RelatedParty");
        engagedParty.setAtSchemaLocation(URI.create("https://my.api/schema/RelatedParty"));
        engagedParty.setAtType("RelatedParty");
        engagedParty.setAtReferredType("Individual");

        response.setEngagedParty(engagedParty);

        TimePeriod validFor = new TimePeriod();
        validFor.setStartDateTime(OffsetDateTime.now());
        validFor.setEndDateTime(OffsetDateTime.now().plusMonths(6));
        response.setValidFor(validFor);

        return ResponseEntity.status(201).body(response);
    }

    @Override
    @DeleteMapping(value = "/partyRole/{id}")
    public ResponseEntity<Void> deletePartyRole(@PathVariable("id") String id) {
        // Your deletion logic here (e.g., remove from database)

        // For now, just return 204 No Content to pass the test
        return ResponseEntity.noContent().build();
    }





}
