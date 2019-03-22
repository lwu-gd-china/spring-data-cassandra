/*
 * Copyright 2016-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.cassandra.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;

/**
 * @author Mark Paluch
 * @see <a href=
 *      "http://www.datastax.com/dev/blog/basic-rules-of-cassandra-data-modeling">http://www.datastax.com/dev/blog/basic-rules-of-cassandra-data-modeling</a>
 */
@PrimaryKeyClass
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupKey implements Serializable {

	@PrimaryKeyColumn(ordinal = 1, type = PrimaryKeyType.PARTITIONED) private String groupname;
	@PrimaryKeyColumn(name = "hash_prefix", ordinal = 2, type = PrimaryKeyType.PARTITIONED) private String hashPrefix;
	@PrimaryKeyColumn(ordinal = 3, type = PrimaryKeyType.CLUSTERED) private String username;
}
