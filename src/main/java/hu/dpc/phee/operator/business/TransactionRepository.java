package hu.dpc.phee.operator.business;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TransactionRepository extends JpaRepository<Transaction, Long>, JpaSpecificationExecutor {

    Transaction findFirstByWorkflowInstanceKey(Long workflowInstanceKey);

}