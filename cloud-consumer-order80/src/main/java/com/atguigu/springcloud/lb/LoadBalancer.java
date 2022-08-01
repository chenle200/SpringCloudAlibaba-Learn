package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import javax.xml.ws.Service;
import java.util.List;

public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstance);
}
