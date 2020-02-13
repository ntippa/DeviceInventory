package com.ntip.deviceinventory.devicelist



sealed class DeviceListViewEvent {
    data class OnDeviceItemClick(val position: Int) : DeviceListViewEvent()
}
