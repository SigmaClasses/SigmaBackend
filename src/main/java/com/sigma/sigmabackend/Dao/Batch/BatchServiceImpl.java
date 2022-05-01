package com.sigma.sigmabackend.Dao.Batch;

import com.sigma.sigmabackend.Dao.Batch.BatchServiceDao;
import com.sigma.sigmabackend.Model.Batch;
import com.sigma.sigmabackend.Repository.BatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BatchServiceImpl implements BatchServiceDao {
    @Autowired
    private BatchRepository batchRepository;

    @Override
    public Batch addBatch(Batch batch) {
        if(batch != null){
            batchRepository.saveAndFlush(batch);
            return batch;
        }
        return null;
    }

    @Override
    public Batch fetchBatchDetails(int id) {
        Optional<Batch> batch = batchRepository.findById(id);
        if(batch.isPresent()){
            return batch.get();
        }
        return null;
    }

    @Override
    public List<Batch> getAllBatch() {
        List<Batch> batchList = batchRepository.findAll();
        if(batchList != null && batchList.size()>0){
            return batchList;
        }
        return null;
    }

    @Override
    public boolean updateBatch(Batch batch, int id) {
        Batch existingBatch = batchRepository.getById(id);
        if(existingBatch != null){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBatch(int id) {
        batchRepository.deleteById(id);
        return true;
    }
}
