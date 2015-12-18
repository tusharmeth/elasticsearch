/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.watcher.transport.actions.ack;

import org.elasticsearch.action.support.master.MasterNodeOperationRequestBuilder;
import org.elasticsearch.client.ElasticsearchClient;

/**
 * A ack watch action request builder.
 */
public class AckWatchRequestBuilder extends MasterNodeOperationRequestBuilder<AckWatchRequest, AckWatchResponse, AckWatchRequestBuilder> {

    public AckWatchRequestBuilder(ElasticsearchClient client) {
        super(client, AckWatchAction.INSTANCE, new AckWatchRequest());
    }

    public AckWatchRequestBuilder(ElasticsearchClient client, String id) {
        super(client, AckWatchAction.INSTANCE, new AckWatchRequest(id));
    }

    public AckWatchRequestBuilder setActionIds(String... actionIds) {
        request.setActionIds(actionIds);
        return this;
    }


}
