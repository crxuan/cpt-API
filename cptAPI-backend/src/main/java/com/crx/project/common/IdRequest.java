package com.crx.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author crx
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}