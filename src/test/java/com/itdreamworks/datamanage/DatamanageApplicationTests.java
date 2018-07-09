package com.itdreamworks.datamanage;

import com.itdreamworks.datamanage.daoservice.DeviceService;
import com.itdreamworks.datamanage.entity.Device;
import com.itdreamworks.datamanage.mapper.DeviceECEMapMapper;
import com.itdreamworks.datamanage.mapper.DeviceMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatamanageApplicationTests {
@Autowired
DeviceService deviceService;
@Autowired
DeviceMapper deviceMapper;
	@Test
	public void contextLoads() {
		List<String> list = new ArrayList<>();
		list.add("0101000001");
		list.add("0101000002");
		System.out.println(list);
		 deviceMapper.changeDeviceStatus(list);

	}

}
