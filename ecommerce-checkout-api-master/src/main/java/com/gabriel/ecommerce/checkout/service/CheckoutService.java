package com.gabriel.ecommerce.checkout.service;

import com.gabriel.ecommerce.checkout.entity.CheckoutEntity;
import com.gabriel.ecommerce.checkout.resource.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
