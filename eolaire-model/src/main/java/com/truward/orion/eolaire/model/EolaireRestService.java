package com.truward.orion.eolaire.model;

import org.springframework.web.bind.annotation.*;

/**
 * Defines a contract for major RESTful operations on user service.
 *
 * @author Alexander Shabanov
 */
public interface EolaireRestService {

  @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
  @ResponseBody
  EolaireModel.Item getItemById(@PathVariable("id") long id);

  @RequestMapping(value = "/item/list", method = RequestMethod.POST)
  @ResponseBody
  EolaireModel.GetItemsResponse getItemsByIds(@RequestBody EolaireModel.GetItemsRequest request);
}
