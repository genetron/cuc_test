package com.cuc.service;

import com.cuc.model.ApiVersion;
import com.cuc.model.ApiVersionNoSql;

public interface VersionService {
	public ApiVersionNoSql getVersion();
}
