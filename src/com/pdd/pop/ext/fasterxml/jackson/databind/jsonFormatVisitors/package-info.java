/**
 * Classes used for exposing logical structure of POJOs as Jackson
 * sees it, and exposed via
 * {@link com.pdd.pop.ext.fasterxml.jackson.databind.ObjectMapper#acceptJsonFormatVisitor(Class, JsonFormatVisitorWrapper)}
 * and
 * {@link com.pdd.pop.ext.fasterxml.jackson.databind.ObjectMapper#acceptJsonFormatVisitor(com.pdd.pop.ext.fasterxml.jackson.databind.JavaType, JsonFormatVisitorWrapper)}
 * methods.
 *<p>
 * The main entrypoint for code, then, is {@link com.pdd.pop.ext.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper} and other
 * types are recursively needed during traversal.
 */
package com.pdd.pop.ext.fasterxml.jackson.databind.jsonFormatVisitors;
