/*
 * Copyright (c) 2013, 2014, 2015, 2016, 2017, 2018 EnergyOS.org
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 *
 * ********************************************************************************
 *
 *  Copyright (c) 2018 Green Button Alliance, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package org.greenbuttonalliance.espi.common.service;

import org.greenbuttonalliance.espi.common.domain.ElectricPowerQualitySummary;
import org.greenbuttonalliance.espi.common.domain.UsagePoint;
import org.greenbuttonalliance.espi.common.models.atom.EntryType;
import org.greenbuttonalliance.espi.common.utils.EntryTypeIterator;

import java.io.InputStream;
import java.util.List;
import java.util.UUID;

public interface ElectricPowerQualitySummaryService {

	public ElectricPowerQualitySummary findById(
			Long electricPowerQualitySummaryId);

	public ElectricPowerQualitySummary findByUUID(UUID uuid);

	public List<ElectricPowerQualitySummary> findAllByUsagePoint(
			UsagePoint usagePoint);

	public String feedFor(
			List<ElectricPowerQualitySummary> electricPowerQualitySummarys);

	public String entryFor(
			ElectricPowerQualitySummary electricPowerQualitySummary);

	public void associateByUUID(UsagePoint usagePoint, UUID uuid);

	public void persist(ElectricPowerQualitySummary electricPowerQualitySummary);

	public EntryType findEntryType(Long retailCustomerId, Long usagePointId,
			Long electricPowerQualitySummaryId);

	public EntryTypeIterator findEntryTypeIterator(Long retailCustomerId,
			Long usagePointId);

	public void add(ElectricPowerQualitySummary electricPowerQualitySummary);

	public void delete(ElectricPowerQualitySummary electricPowerQualitySummary);

	public ElectricPowerQualitySummary importResource(InputStream stream);

}
