package com.ironhack.demosecurityjwt.dtos;

import lombok.Data;

/**
 * Data transfer object for passing information for adding a role to a user
 */
@Data
public class RoleToUserDTO {
    /**
     * The username of the user
     */
    private String username;
    /**
     * The name of the role
     */
    private String roleName;
}
