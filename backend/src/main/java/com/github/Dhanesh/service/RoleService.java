package com.github.Dhanesh.service;

import com.github.Dhanesh.model.Role;
import com.github.Dhanesh.model.RoleType;
import com.github.Dhanesh.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Service used for Role related operations
 */
@Slf4j(topic = "RoleService")
@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    /**
     * Fetches list of role (entity) by the given role types
     *
     * @param types
     * @return List of Role
     */
    public List<Role> getReferenceByTypeIsIn(Set<RoleType> types) {
        return roleRepository.getReferenceByTypeIsIn(types);
    }

    /**
     * Fetches all roles as entity
     *
     * @return List of Role
     */
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}
