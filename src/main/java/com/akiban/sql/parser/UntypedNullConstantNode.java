
/* The original from which this derives bore the following: */

/*

   Derby - Class org.apache.derby.impl.sql.compile.UntypedNullConstantNode

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to you under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */

package com.akiban.sql.parser;

/**
 * An UntypedNullConstantNode represents a SQL NULL before it has
 * been bound.  The bind() operation will replace the UntypedNullConstantNodes
 * with typed ConstantNodes.
 */

public final class UntypedNullConstantNode extends ConstantNode
{
    /**
     * Constructor for an UntypedNullConstantNode.  Untyped constants
     * contain no state (not too surprising).
     */

    public UntypedNullConstantNode() {
        super();
    }

}
