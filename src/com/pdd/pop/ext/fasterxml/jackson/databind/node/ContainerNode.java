package com.pdd.pop.ext.fasterxml.jackson.databind.node;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.pdd.pop.ext.fasterxml.jackson.core.*;
import com.pdd.pop.ext.fasterxml.jackson.databind.JsonNode;
import com.pdd.pop.ext.fasterxml.jackson.databind.util.RawValue;

/**
 * This intermediate base class is used for all container nodes,
 * specifically, array and object nodes.
 */
public abstract class ContainerNode<T extends ContainerNode<T>>
    extends BaseJsonNode
    implements JsonNodeCreator
{
    /**
     * We will keep a reference to the Object (usually TreeMapper)
     * that can construct instances of nodes to add to this container
     * node.
     */
    protected final JsonNodeFactory _nodeFactory;

    protected ContainerNode(JsonNodeFactory nc) {
        _nodeFactory = nc;
    }

    // all containers are mutable: can't define:
//    @Override public abstract <T extends JsonNode> T deepCopy();

    @Override
    public abstract JsonToken asToken();

    @Override
    public String asText() { return ""; }

    /*
    /**********************************************************
    /* Methods reset as abstract to force real implementation
    /**********************************************************
     */

    @Override
    public abstract int size();

    @Override
    public abstract JsonNode get(int index);

    @Override
    public abstract JsonNode get(String fieldName);

    /*
    /**********************************************************
    /* JsonNodeCreator implementation, just dispatch to
    /* the real creator
    /**********************************************************
     */

    /**
     * Factory method that constructs and returns an empty {@link ArrayNode}
     * Construction is done using registered {@link JsonNodeFactory}.
     */
    @Override
    public final ArrayNode arrayNode() { return _nodeFactory.arrayNode(); }

    /**
     * Factory method that constructs and returns an {@link ArrayNode} with an initial capacity
     * Construction is done using registered {@link JsonNodeFactory}
     * @param capacity the initial capacity of the ArrayNode
     */
    @Override
    public final ArrayNode arrayNode(int capacity) { return _nodeFactory.arrayNode(capacity); }

    /**
     * Factory method that constructs and returns an empty {@link ObjectNode}
     * Construction is done using registered {@link JsonNodeFactory}.
     */
    @Override
    public final ObjectNode objectNode() { return _nodeFactory.objectNode(); }

    @Override
    public final NullNode nullNode() { return _nodeFactory.nullNode(); }

    @Override
    public final BooleanNode booleanNode(boolean v) { return _nodeFactory.booleanNode(v); }

    @Override
    public final NumericNode numberNode(byte v) { return _nodeFactory.numberNode(v); }
    @Override
    public final NumericNode numberNode(short v) { return _nodeFactory.numberNode(v); }
    @Override
    public final NumericNode numberNode(int v) { return _nodeFactory.numberNode(v); }
    @Override
    public final NumericNode numberNode(long v) {
        return _nodeFactory.numberNode(v);
    }

    @Override
    public final NumericNode numberNode(float v) { return _nodeFactory.numberNode(v); }
    @Override
    public final NumericNode numberNode(double v) { return _nodeFactory.numberNode(v); }

    @Override
    public final ValueNode numberNode(BigInteger v) { return _nodeFactory.numberNode(v); }
    @Override
    public final ValueNode numberNode(BigDecimal v) { return (_nodeFactory.numberNode(v)); }

    @Override
    public final ValueNode numberNode(Byte v) { return _nodeFactory.numberNode(v); }
    @Override
    public final ValueNode numberNode(Short v) { return _nodeFactory.numberNode(v); }
    @Override
    public final ValueNode numberNode(Integer v) { return _nodeFactory.numberNode(v); }
    @Override
    public final ValueNode numberNode(Long v) { return _nodeFactory.numberNode(v); }

    @Override
    public final ValueNode numberNode(Float v) { return _nodeFactory.numberNode(v); }
    @Override
    public final ValueNode numberNode(Double v) { return _nodeFactory.numberNode(v); }

    @Override
    public final TextNode textNode(String text) { return _nodeFactory.textNode(text); }

    @Override
    public final BinaryNode binaryNode(byte[] data) { return _nodeFactory.binaryNode(data); }
    @Override
    public final BinaryNode binaryNode(byte[] data, int offset, int length) { return _nodeFactory.binaryNode(data, offset, length); }

    @Override
    public final ValueNode pojoNode(Object pojo) { return _nodeFactory.pojoNode(pojo); }

    @Override
    public final ValueNode rawValueNode(RawValue value) { return _nodeFactory.rawValueNode(value); }

    /*
    /**********************************************************
    /* Common mutators
    /**********************************************************
     */

    /**
     * Method for removing all children container has (if any)
     *
     * @return Container node itself (to allow method call chaining)
     */
    public abstract T removeAll();
}
