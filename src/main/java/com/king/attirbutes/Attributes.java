package com.king.attirbutes;

import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import io.netty.util.AttributeKey;

public interface Attributes {

    AttributeKey<WebSocketServerHandshaker> HAND_SHAKE = AttributeKey.newInstance("handshaker");

}
