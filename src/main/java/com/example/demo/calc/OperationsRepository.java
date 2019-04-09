package com.example.demo.calc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface OperationsRepository extends JpaRepository<Operation, Long> {
}
