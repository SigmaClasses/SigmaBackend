package com.sigma.sigmabackend.Controller;

import com.sigma.sigmabackend.Dao.Batch.BatchServiceDao;
import com.sigma.sigmabackend.Model.Batch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class BatchController {

    @Autowired
    private BatchServiceDao batchServiceDao;

    @PostMapping(value = "/add/batch", consumes = "application/json; charset=utf-8")
    public ResponseEntity<?> addBatch(@RequestBody Batch batch){
        if(batchServiceDao.addBatch(batch) != null){
           return new ResponseEntity<Batch>(batch, HttpStatus.CREATED);
        }
        return  new ResponseEntity<String>("Batch can't added",HttpStatus.CONFLICT);
    }

    @GetMapping("/all/batch")
    public ResponseEntity<?> getAllBatch(){
        List<Batch> batchList = batchServiceDao.getAllBatch();
        if(batchList != null){
            return  new ResponseEntity<List<Batch>>(batchList,HttpStatus.OK);
        }
        return new ResponseEntity<String>("Batch List is Empty",HttpStatus.NO_CONTENT);
    }
}
