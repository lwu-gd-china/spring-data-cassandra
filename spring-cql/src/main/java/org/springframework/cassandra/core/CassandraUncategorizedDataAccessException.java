/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cassandra.core;

import org.springframework.dao.UncategorizedDataAccessException;

/**
 * Wrapper for all non RuntimeExceptions throws by the Cassandra Driver
 *
 * @author David Webb
 */
public class CassandraUncategorizedDataAccessException extends UncategorizedDataAccessException {

	private static final long serialVersionUID = -155082875466458401L;

	/**
	 * Create the Exception
	 *
	 * @param message
	 * @param cause
	 */
	public CassandraUncategorizedDataAccessException(String message, Throwable cause) {
		super(message, cause);
	}

}
