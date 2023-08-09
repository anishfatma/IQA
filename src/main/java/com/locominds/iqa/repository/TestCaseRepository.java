package com.locominds.iqa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locominds.iqa.entity.TestCase;

public interface TestCaseRepository extends JpaRepository<TestCase, Long> {

}
