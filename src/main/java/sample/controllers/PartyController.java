package sample.controllers;

import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.util.EntityQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/party")
public class PartyController {

    @Autowired
    private Delegator delegator;

    @RequestMapping(value = "", method = GET)
    public List<GenericValue> getParties() throws GenericEntityException {
        return EntityQuery.use(delegator).from("Party").queryList();
    }
}
