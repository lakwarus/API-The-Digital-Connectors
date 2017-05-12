package com.wso2.sample.people.api;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@RequestMapping("people/skills")
public class PeopleAPI {

    /*
    Each function of this API is exposed via its particular HTTP request method.
    In the request, it extracts the JSON Web Token (JWT) in the header "X-JWT-Assertion".
    In order to continue the flow even without requiring a JWT, the request header for X-JWT-Assertion is declared as
    optional by setting required = false.
     */

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    String list(@RequestHeader(required = false, value = JWTUtil.JWT_HEADER) String jwt) {

        return "Listing Skills for user : " + JWTUtil.getUsernameFromJWT(jwt);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    String add(@RequestHeader(required = false, value = JWTUtil.JWT_HEADER) String jwt) {

        return "Adding Skills for user : " + JWTUtil.getUsernameFromJWT(jwt);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    String update(@RequestHeader(required = false, value = JWTUtil.JWT_HEADER) String jwt) {

        return "Updating Skills for user : " + JWTUtil.getUsernameFromJWT(jwt);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    String delete(@RequestHeader(required = false, value = JWTUtil.JWT_HEADER) String jwt) {

        return "Deleting Skills for user : " + JWTUtil.getUsernameFromJWT(jwt);
    }


}
