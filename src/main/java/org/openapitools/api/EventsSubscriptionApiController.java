package org.openapitools.api;

import org.openapitools.model.EventSubscription;
import org.openapitools.model.EventSubscriptionInput;
import org.openapitools.model.Error;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-21T13:52:01.148871+05:30[Asia/Colombo]", comments = "Generator version: 7.13.0")
@Controller
@RequestMapping("${openapi.partyRoleManagement.base-path:/tmf-api/partyRole/v4}")
public class EventsSubscriptionApiController implements EventsSubscriptionApi {

    private final NativeWebRequest request;

    @Autowired
    public EventsSubscriptionApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    // ✅ Add the POST endpoint implementation
    @PostMapping("/hub")
    public ResponseEntity<EventSubscription> registerListener(
            @Valid @RequestBody EventSubscriptionInput input) {

        EventSubscription response = new EventSubscription();
        response.setId("sub-123"); // Example ID

        // Construct Location URI for the created subscription
        String location = "/tmf-api/partyRole/v4/hub/" + response.getId();

        return ResponseEntity
                .status(HttpStatus.CREATED) // Set HTTP 201
                .header("Location", location) // Required by TMF REST APIs
                .body(response);
    }

}
