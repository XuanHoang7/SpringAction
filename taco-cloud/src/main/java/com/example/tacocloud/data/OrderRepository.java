package com.example.tacocloud.data;

import com.example.tacocloud.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder tacoOrder);
}
