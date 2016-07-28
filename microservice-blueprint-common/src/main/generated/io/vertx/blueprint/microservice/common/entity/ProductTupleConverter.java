/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.blueprint.microservice.common.entity;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link io.vertx.blueprint.microservice.common.entity.ProductTuple}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.blueprint.microservice.common.entity.ProductTuple} original class using Vert.x codegen.
 */
public class ProductTupleConverter {

  public static void fromJson(JsonObject json, ProductTuple obj) {
    if (json.getValue("amount") instanceof Number) {
      obj.setAmount(((Number)json.getValue("amount")).intValue());
    }
    if (json.getValue("productId") instanceof String) {
      obj.setProductId((String)json.getValue("productId"));
    }
  }

  public static void toJson(ProductTuple obj, JsonObject json) {
    if (obj.getAmount() != null) {
      json.put("amount", obj.getAmount());
    }
    if (obj.getProductId() != null) {
      json.put("productId", obj.getProductId());
    }
  }
}