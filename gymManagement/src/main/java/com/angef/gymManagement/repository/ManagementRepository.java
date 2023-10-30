package com.angef.gymManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angef.gymManagement.entity.Management;


@Repository
public interface ManagementRepository extends JpaRepository<Management, Long>{

}
