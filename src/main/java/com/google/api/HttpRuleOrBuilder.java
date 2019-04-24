/**
 * Copyright 2018 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/http.proto

package com.google.api;

public interface HttpRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.HttpRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Selects methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  java.lang.String getSelector();
  /**
   * <pre>
   * Selects methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <pre>
   * Used for listing and getting information about resources.
   * </pre>
   *
   * <code>string get = 2;</code>
   */
  java.lang.String getGet();
  /**
   * <pre>
   * Used for listing and getting information about resources.
   * </pre>
   *
   * <code>string get = 2;</code>
   */
  com.google.protobuf.ByteString
      getGetBytes();

  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>string put = 3;</code>
   */
  java.lang.String getPut();
  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>string put = 3;</code>
   */
  com.google.protobuf.ByteString
      getPutBytes();

  /**
   * <pre>
   * Used for creating a resource.
   * </pre>
   *
   * <code>string post = 4;</code>
   */
  java.lang.String getPost();
  /**
   * <pre>
   * Used for creating a resource.
   * </pre>
   *
   * <code>string post = 4;</code>
   */
  com.google.protobuf.ByteString
      getPostBytes();

  /**
   * <pre>
   * Used for deleting a resource.
   * </pre>
   *
   * <code>string delete = 5;</code>
   */
  java.lang.String getDelete();
  /**
   * <pre>
   * Used for deleting a resource.
   * </pre>
   *
   * <code>string delete = 5;</code>
   */
  com.google.protobuf.ByteString
      getDeleteBytes();

  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>string patch = 6;</code>
   */
  java.lang.String getPatch();
  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>string patch = 6;</code>
   */
  com.google.protobuf.ByteString
      getPatchBytes();

  /**
   * <pre>
   * The custom pattern is used for specifying an HTTP method that is not
   * included in the `pattern` field, such as HEAD, or "*" to leave the
   * HTTP method unspecified for this rule. The wild-card rule is useful
   * for services that provide content to Web (HTML) clients.
   * </pre>
   *
   * <code>.google.api.CustomHttpPattern custom = 8;</code>
   */
  boolean hasCustom();
  /**
   * <pre>
   * The custom pattern is used for specifying an HTTP method that is not
   * included in the `pattern` field, such as HEAD, or "*" to leave the
   * HTTP method unspecified for this rule. The wild-card rule is useful
   * for services that provide content to Web (HTML) clients.
   * </pre>
   *
   * <code>.google.api.CustomHttpPattern custom = 8;</code>
   */
  com.google.api.CustomHttpPattern getCustom();
  /**
   * <pre>
   * The custom pattern is used for specifying an HTTP method that is not
   * included in the `pattern` field, such as HEAD, or "*" to leave the
   * HTTP method unspecified for this rule. The wild-card rule is useful
   * for services that provide content to Web (HTML) clients.
   * </pre>
   *
   * <code>.google.api.CustomHttpPattern custom = 8;</code>
   */
  com.google.api.CustomHttpPatternOrBuilder getCustomOrBuilder();

  /**
   * <pre>
   * The name of the request field whose value is mapped to the HTTP body, or
   * `*` for mapping all fields not captured by the path pattern to the HTTP
   * body. NOTE: the referred field must not be a repeated field and must be
   * present at the top-level of request message type.
   * </pre>
   *
   * <code>string body = 7;</code>
   */
  java.lang.String getBody();
  /**
   * <pre>
   * The name of the request field whose value is mapped to the HTTP body, or
   * `*` for mapping all fields not captured by the path pattern to the HTTP
   * body. NOTE: the referred field must not be a repeated field and must be
   * present at the top-level of request message type.
   * </pre>
   *
   * <code>string body = 7;</code>
   */
  com.google.protobuf.ByteString
      getBodyBytes();

  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must
   * not contain an `additional_bindings` field themselves (that is,
   * the nesting may only be one level deep).
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  java.util.List<com.google.api.HttpRule>
      getAdditionalBindingsList();
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must
   * not contain an `additional_bindings` field themselves (that is,
   * the nesting may only be one level deep).
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  com.google.api.HttpRule getAdditionalBindings(int index);
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must
   * not contain an `additional_bindings` field themselves (that is,
   * the nesting may only be one level deep).
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  int getAdditionalBindingsCount();
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must
   * not contain an `additional_bindings` field themselves (that is,
   * the nesting may only be one level deep).
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  java.util.List<? extends com.google.api.HttpRuleOrBuilder>
      getAdditionalBindingsOrBuilderList();
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must
   * not contain an `additional_bindings` field themselves (that is,
   * the nesting may only be one level deep).
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  com.google.api.HttpRuleOrBuilder getAdditionalBindingsOrBuilder(
      int index);

  public com.google.api.HttpRule.PatternCase getPatternCase();
}
