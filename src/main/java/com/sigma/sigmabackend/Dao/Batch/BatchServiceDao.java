package com.sigma.sigmabackend.Dao.Batch;

import com.sigma.sigmabackend.Model.Batch;

import java.util.List;

public interface BatchServiceDao {

    public Batch addBatch(Batch batch);

    public Batch fetchBatchDetails(int id);

    public List<Batch> getAllBatch();

    public boolean updateBatch(Batch batch,int id);

    public boolean deleteBatch(int id);
}
