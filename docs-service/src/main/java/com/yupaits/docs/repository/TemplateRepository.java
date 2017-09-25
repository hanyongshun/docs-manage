package com.yupaits.docs.repository;

import com.yupaits.docs.entity.Template;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TemplateRepository
 * Created by ts495 on 2017/9/21.
 */
public interface TemplateRepository extends JpaRepository<Template, Integer>, Specification<Template> {

    Page<Template> findAll(Specification<Template> specification, Pageable pageable);

    Page<Template> findByOwnerIdAndIsDeletedIsFalseOrderBySortCodeAsc(Integer ownerId, Pageable pageable);

    @Override
    Template findOne(Integer templateId);

    @Override
    <S extends Template> S save(S s);

}