/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/managedidentities/v1/resource.proto

package com.google.cloud.managedidentities.v1;

public final class ResourceProto {
  private ResourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_Domain_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_Domain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_Domain_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_Domain_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_Trust_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_Trust_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/managedidentities/v1/reso"
          + "urce.proto\022!google.cloud.managedidentiti"
          + "es.v1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\037google/protob"
          + "uf/timestamp.proto\"\236\006\n\006Domain\022\021\n\004name\030\001 "
          + "\001(\tB\003\340A\002\022J\n\006labels\030\002 \003(\01325.google.cloud."
          + "managedidentities.v1.Domain.LabelsEntryB"
          + "\003\340A\001\022 \n\023authorized_networks\030\003 \003(\tB\003\340A\001\022\036"
          + "\n\021reserved_ip_range\030\004 \001(\tB\003\340A\002\022\026\n\tlocati"
          + "ons\030\005 \003(\tB\003\340A\002\022\022\n\005admin\030\006 \001(\tB\003\340A\001\022\021\n\004fq"
          + "dn\030\n \001(\tB\003\340A\003\0224\n\013create_time\030\013 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\003\340A\003\0224\n\013update_ti"
          + "me\030\014 \001(\0132\032.google.protobuf.TimestampB\003\340A"
          + "\003\022C\n\005state\030\r \001(\0162/.google.cloud.managedi"
          + "dentities.v1.Domain.StateB\003\340A\003\022\033\n\016status"
          + "_message\030\016 \001(\tB\003\340A\003\022=\n\006trusts\030\017 \003(\0132(.go"
          + "ogle.cloud.managedidentities.v1.TrustB\003\340"
          + "A\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030"
          + "\002 \001(\t:\0028\001\"\217\001\n\005State\022\025\n\021STATE_UNSPECIFIED"
          + "\020\000\022\014\n\010CREATING\020\001\022\t\n\005READY\020\002\022\014\n\010UPDATING\020"
          + "\003\022\014\n\010DELETING\020\004\022\r\n\tREPAIRING\020\005\022\032\n\026PERFOR"
          + "MING_MAINTENANCE\020\006\022\017\n\013UNAVAILABLE\020\007:f\352Ac"
          + "\n\'managedidentities.googleapis.com/Domai"
          + "n\0228projects/{project}/locations/{locatio"
          + "n}/domains/{domain}\"\341\006\n\005Trust\022\037\n\022target_"
          + "domain_name\030\001 \001(\tB\003\340A\002\022K\n\ntrust_type\030\002 \001"
          + "(\01622.google.cloud.managedidentities.v1.T"
          + "rust.TrustTypeB\003\340A\002\022U\n\017trust_direction\030\003"
          + " \001(\01627.google.cloud.managedidentities.v1"
          + ".Trust.TrustDirectionB\003\340A\002\022%\n\030selective_"
          + "authentication\030\004 \001(\010B\003\340A\001\022$\n\027target_dns_"
          + "ip_addresses\030\005 \003(\tB\003\340A\002\022#\n\026trust_handsha"
          + "ke_secret\030\006 \001(\tB\003\340A\002\0224\n\013create_time\030\007 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013up"
          + "date_time\030\010 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\022B\n\005state\030\t \001(\0162..google.cloud.m"
          + "anagedidentities.v1.Trust.StateB\003\340A\003\022\036\n\021"
          + "state_description\030\013 \001(\tB\003\340A\003\022B\n\031last_tru"
          + "st_heartbeat_time\030\014 \001(\0132\032.google.protobu"
          + "f.TimestampB\003\340A\003\"i\n\005State\022\025\n\021STATE_UNSPE"
          + "CIFIED\020\000\022\014\n\010CREATING\020\001\022\014\n\010UPDATING\020\002\022\014\n\010"
          + "DELETING\020\003\022\r\n\tCONNECTED\020\004\022\020\n\014DISCONNECTE"
          + "D\020\005\"A\n\tTrustType\022\032\n\026TRUST_TYPE_UNSPECIFI"
          + "ED\020\000\022\n\n\006FOREST\020\001\022\014\n\010EXTERNAL\020\002\"_\n\016TrustD"
          + "irection\022\037\n\033TRUST_DIRECTION_UNSPECIFIED\020"
          + "\000\022\013\n\007INBOUND\020\001\022\014\n\010OUTBOUND\020\002\022\021\n\rBIDIRECT"
          + "IONAL\020\003B\373\001\n%com.google.cloud.managediden"
          + "tities.v1B\rResourceProtoP\001ZRgoogle.golan"
          + "g.org/genproto/googleapis/cloud/managedi"
          + "dentities/v1;managedidentities\252\002!Google."
          + "Cloud.ManagedIdentities.V1\312\002!Google\\Clou"
          + "d\\ManagedIdentities\\V1\352\002$Google::Cloud::"
          + "ManagedIdentities::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_managedidentities_v1_Domain_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_managedidentities_v1_Domain_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_Domain_descriptor,
            new java.lang.String[] {
              "Name",
              "Labels",
              "AuthorizedNetworks",
              "ReservedIpRange",
              "Locations",
              "Admin",
              "Fqdn",
              "CreateTime",
              "UpdateTime",
              "State",
              "StatusMessage",
              "Trusts",
            });
    internal_static_google_cloud_managedidentities_v1_Domain_LabelsEntry_descriptor =
        internal_static_google_cloud_managedidentities_v1_Domain_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_managedidentities_v1_Domain_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_Domain_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_managedidentities_v1_Trust_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_managedidentities_v1_Trust_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_Trust_descriptor,
            new java.lang.String[] {
              "TargetDomainName",
              "TrustType",
              "TrustDirection",
              "SelectiveAuthentication",
              "TargetDnsIpAddresses",
              "TrustHandshakeSecret",
              "CreateTime",
              "UpdateTime",
              "State",
              "StateDescription",
              "LastTrustHeartbeatTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
