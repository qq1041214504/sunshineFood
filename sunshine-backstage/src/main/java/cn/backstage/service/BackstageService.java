package cn.backstage.service;

import java.util.List;

import org.entity.Buyer;

public interface BackstageService {
	public List<Buyer> getAll(int pageNo);
}
