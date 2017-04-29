package com.bunkrtech.website.model;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * Created by jkratz on 4/27/17.
 */
public final class ServiceDTO implements Serializable {

    private final int id;
    private final String description;

    public ServiceDTO(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDesciption() {
        return description;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("desrciption", description)
                .toString();
    }
}
