package net.qcollins.backend.repository;

import net.qcollins.backend.domain.GithubProject;
import org.springframework.data.repository.CrudRepository;

public interface GithubProjectRepository extends CrudRepository<GithubProject, Long> { }
