/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.watcher.transport.actions.delete;

import org.elasticsearch.action.support.master.MasterNodeOperationRequestBuilder;
import org.elasticsearch.client.ElasticsearchClient;

/**
 * A delete document action request builder.
 */
public class DeleteWatchRequestBuilder extends MasterNodeOperationRequestBuilder<DeleteWatchRequest, DeleteWatchResponse, DeleteWatchRequestBuilder> {

    public DeleteWatchRequestBuilder(ElasticsearchClient client) {
        super(client, DeleteWatchAction.INSTANCE, new DeleteWatchRequest());
    }

    public DeleteWatchRequestBuilder(ElasticsearchClient client, String id) {
        super(client, DeleteWatchAction.INSTANCE, new DeleteWatchRequest(id));
    }

    /**
     * Sets the id of the watch to be deleted
     */
    public DeleteWatchRequestBuilder setId(String id) {
        this.request().setId(id);
        return this;
    }

    /**
     * Sets wiether this request is forced (ie ignores locks)
     */
    public DeleteWatchRequestBuilder setForce(boolean force) {
        this.request().setForce(force);
        return this;
    }

}
