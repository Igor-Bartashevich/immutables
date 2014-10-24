/*
    Copyright 2014 Ievgen Lukash

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.immutables.fixture.nested;

import com.google.common.base.Optional;
import org.immutables.value.Json;
import org.immutables.value.Value;

@Value.Nested
@Value.Transformer
@Json.Marshaled
class GroupedClasses {
  interface Other {}

  @Value.Immutable
  interface NestedOne extends Other {
    Optional<Other> other();

    int attribute();
  }
}
