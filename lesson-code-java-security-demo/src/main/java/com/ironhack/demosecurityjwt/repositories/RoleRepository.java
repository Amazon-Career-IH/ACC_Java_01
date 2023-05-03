package com.ironhack.demosecurityjwt.repositories;

import com.ironhack.demosecurityjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The RoleRepository interface extends JpaRepository to allow for CRUD operations
 * on Role entities in the database.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    /**
     * Method to find a Role entity by its name field
     *
     * @param name The name of the Role entity to search for
     * @return The found Role entity or null if not found
     */
    Role findByName(String name);
}
