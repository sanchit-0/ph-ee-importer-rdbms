package hu.dpc.phee.operator.audit;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface VariableRepository extends CrudRepository<Variable, Long> {

    List<Variable> findByWorkflowInstanceKeyOrderByTimestamp(Long workflowInstanceKey);

}