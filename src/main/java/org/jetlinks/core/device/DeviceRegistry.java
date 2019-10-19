package org.jetlinks.core.device;

import reactor.core.publisher.Mono;

/**
 * 设备注册中心
 *
 * @author zhouhao
 * @since 1.0.0
 */
public interface DeviceRegistry {

    /**
     * 获取设备操作接口.
     *
     * @param deviceId 设备ID
     * @return 设备操作接口
     */
    Mono<DeviceOperator> getDevice(String deviceId);

    /**
     * 获取设备产品操作,请勿缓存返回值,注册中心已经实现本地缓存.
     *
     * @param productId 产品ID
     * @return 设备操作接口
     */
    Mono<DeviceProductOperator> getProduct(String productId);

    /**
     * 注册设备,并返回设备操作接口,请勿缓存返回值,注册中心已经实现本地缓存.
     *
     * @param deviceInfo 设备基础信息
     * @return 设备操作接口
     * @see this#getDevice(String)
     */
    Mono<DeviceOperator> registry(DeviceInfo deviceInfo);

    Mono<DeviceProductOperator> registry(ProductInfo productInfo);


    /**
     * 注销设备
     *
     * @param deviceId 设备ID
     */
    Mono<Void> unRegistry(String deviceId);

}