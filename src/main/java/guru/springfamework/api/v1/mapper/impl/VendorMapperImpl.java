package guru.springfamework.api.v1.mapper.impl;

import guru.springfamework.api.v1.mapper.VendorMapper;
import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.domain.Vendor;

public class VendorMapperImpl implements VendorMapper {
    @Override
    public VendorDTO vendorToVendorDTO(Vendor vendor) {
        if (vendor == null) {
            return null;
        }

        VendorDTO vendorDTO = new VendorDTO();

        vendorDTO.setName(vendor.getName());

        return vendorDTO;
    }

    @Override
    public Vendor vendorDTOtoVendor(VendorDTO vendorDTO) {
        if (vendorDTO == null) {
            return null;
        }

        Vendor vendor = new Vendor();

        vendor.setName(vendorDTO.getName());
        return vendor;
    }
}
