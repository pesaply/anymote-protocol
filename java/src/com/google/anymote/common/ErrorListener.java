/*
 * Copyright (C) 2010 Google Inc.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.anymote.common;

/**
 * A listener that get called when errors happen in the Anymote Protocol.
 */
public interface ErrorListener {

  /**
   * Called when an error occurs when using the streams.
   *
   * @param message   the error message
   * @param exception the encountered exception
   */
  public void onIoError(String message, Throwable exception);

}