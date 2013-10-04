/*
 * Copyright (C) 2003-2013 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package lab9;

/**
 * Created by The eXo Platform SAS
 * Author : eXoPlatform
 *          exo@exoplatform.com
 * Aug 8, 2013  
 */
public class StringBench {

  public static void main(String[] args) {
    int N = 77777777;
    long t;

    {
      StringBuffer sb = new StringBuffer();
      t = System.currentTimeMillis();
      for (int i = N; i --> 0 ;) {
        sb.append("");
      }
      System.out.println(System.currentTimeMillis() - t);
    }

    {
      StringBuilder sb = new StringBuilder();
      t = System.currentTimeMillis();
      for (int i = N; i --> 0 ;) {
        sb.append("");
      }
      System.out.println(System.currentTimeMillis() - t);
    }

  }
}