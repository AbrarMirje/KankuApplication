package com.kanku.service;

import com.kanku.model.BatchProductSize;
import com.kanku.model.ProductOrder;
import com.kanku.model.Size;

import java.util.List;

public interface ISizeService {
    Size addSize(BatchProductSize batchProductSize);

    List<Size> getSizeByProductId(Size size);

    void updateProductDetails(ProductOrder productOrder);
}
