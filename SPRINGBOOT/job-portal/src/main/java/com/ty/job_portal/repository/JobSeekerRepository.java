package com.ty.job_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.job_portal.dto.JobSeeker;

public interface JobSeekerRepository extends JpaRepository<JobSeeker, Integer> {

	boolean existsByEmail(String email);

	boolean existsByMobile(Long mobile);

}
