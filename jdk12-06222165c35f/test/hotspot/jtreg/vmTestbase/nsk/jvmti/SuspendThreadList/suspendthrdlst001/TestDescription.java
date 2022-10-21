/*
 * Copyright (c) 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


/*
 * @test
 *
 * @summary converted from VM Testbase nsk/jvmti/SuspendThreadList/suspendthrdlst001.
 * VM Testbase keywords: [quick, jpda, jvmti, noras]
 * VM Testbase readme:
 * DESCRIPTION
 *     This JVMTI test exercises JVMTI thread function SuspendThreadList().
 *     This tests checks that for each thread suspended by SuspendThreadList()
 *     function GetThreadState() returns JVMTI_THREAD_STATE_SUSPENDED.
 * COMMENTS
 *     Modified due to fix of the RFE
 *     5001769 TEST_RFE: remove usage of deprecated GetThreadStatus function
 *
 * @library /vmTestbase
 *          /test/lib
 * @run driver jdk.test.lib.FileInstaller . .
 * @build ExecDriver
 *        nsk.jvmti.SuspendThreadList.suspendthrdlst001
 * @run main/othervm/native PropertyResolvingWrapper ExecDriver --java
 *      "-agentlib:suspendthrdlst001=-waittime=5 threads=10"
 *      nsk.jvmti.SuspendThreadList.suspendthrdlst001
 */

