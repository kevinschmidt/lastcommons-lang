/*
 * Copyright 2012 Last.fm
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package fm.last.commons.lang.units;

final class BinaryPower {

  private BinaryPower() {
  }

  static final long B0 = 1L;
  static final long B10 = B0 * 1024L;
  static final long B20 = B10 * 1024L;
  static final long B30 = B20 * 1024L;
  static final long B40 = B30 * 1024L;

}