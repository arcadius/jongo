/*
 * Copyright (C) 2011 Benoit GUEROUT <bguerout at gmail dot com> and Yves AMSELLEM <amsellem dot yves at gmail dot com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jongo.query;

import com.mongodb.DBObject;
import org.jongo.marshall.Marshaller;
import org.jongo.marshall.QueryMarshaller;

public final class Query {
    private final DBObject dbObject;

    public Query(String query, QueryMarshaller queryMarshaller) {
        this.dbObject = queryMarshaller.getQueryMarshaller().marshall(query);
    }

    public DBObject toDBObject() {
        return dbObject;
    }

    @Override
    public String toString() {
        return dbObject.toString();
    }
}
