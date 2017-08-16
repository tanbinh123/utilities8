/*
 * Copyright (C) 2005-2016 Christian P. Lerch <christian.p.lerch[at]gmail.com>
 *  
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package kmworks.util;

import javax.annotation.Nullable;

/**
 *
 * @author Christian P. Lerch
 */
public final class ArrayUtil {
  
  private ArrayUtil() {}
  
  public static boolean isNullOrEmpty(@Nullable Object[] array) {
    return array == null || array.length == 0;
  }

  public static boolean isNullOrEmpty(@Nullable String[] array) {
    return array == null || array.length == 0;
  }
}
