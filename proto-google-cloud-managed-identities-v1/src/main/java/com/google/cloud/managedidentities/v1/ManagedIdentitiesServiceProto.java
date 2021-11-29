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
// source: google/cloud/managedidentities/v1/managed_identities_service.proto

package com.google.cloud.managedidentities.v1;

public final class ManagedIdentitiesServiceProto {
  private ManagedIdentitiesServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_OpMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_OpMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_CreateMicrosoftAdDomainRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_CreateMicrosoftAdDomainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_ResetAdminPasswordRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_ResetAdminPasswordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_ResetAdminPasswordResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_ResetAdminPasswordResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_ListDomainsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_ListDomainsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_ListDomainsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_ListDomainsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_GetDomainRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_GetDomainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_UpdateDomainRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_UpdateDomainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_DeleteDomainRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_DeleteDomainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_AttachTrustRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_AttachTrustRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_ReconfigureTrustRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_ReconfigureTrustRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_DetachTrustRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_DetachTrustRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_ValidateTrustRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_ValidateTrustRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "Bgoogle/cloud/managedidentities/v1/managed_identities_service.proto\022!google.clo"
          + "ud.managedidentities.v1\032\034google/api/anno"
          + "tations.proto\032\027google/api/client.proto\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\0320google/cloud/managed"
          + "identities/v1/resource.proto\032#google/longrunning/operations.proto\032 google/protob"
          + "uf/field_mask.proto\032\037google/protobuf/timestamp.proto\"\334\001\n\n"
          + "OpMetadata\0224\n"
          + "\013create_time\030\001 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n"
          + "\006target\030\003 \001(\tB\003\340A\003\022\021\n"
          + "\004verb\030\004 \001(\tB\003\340A\003\022#\n"
          + "\026requested_cancellation\030\005 \001(\010B\003\340A\003\022\030\n"
          + "\013api_version\030\006 \001(\tB\003\340A\003\"\273\001\n"
          + "\036CreateMicrosoftAdDomainRequest\022?\n"
          + "\006parent\030\001 \001("
          + "\tB/\340A\002\372A)\022\'managedidentities.googleapis.com/Domain\022\030\n"
          + "\013domain_name\030\002 \001(\tB\003\340A\002\022>\n"
          + "\006domain\030\003"
          + " \001(\0132).google.cloud.managedidentities.v1.DomainB\003\340A\002\"Z\n"
          + "\031ResetAdminPasswordRequest\022=\n"
          + "\004name\030\001 \001(\tB/\340A\002\372A)\n"
          + "\'managedidentities.googleapis.com/Domain\".\n"
          + "\032ResetAdminPasswordResponse\022\020\n"
          + "\010password\030\001 \001(\t\"\262\001\n"
          + "\022ListDomainsRequest\022?\n"
          + "\006parent\030\001 \001("
          + "\tB/\340A\002\372A)\022\'managedidentities.googleapis.com/Domain\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n"
          + "\n"
          + "page_token\030\003 \001(\tB\003\340A\001\022\023\n"
          + "\006filter\030\004 \001(\tB\003\340A\001\022\025\n"
          + "\010order_by\030\005 \001(\tB\003\340A\001\"\177\n"
          + "\023ListDomainsResponse\022:\n"
          + "\007domains\030\001 \003(\0132).google.cloud.managedidentities.v1.Domain\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\023\n"
          + "\013unreachable\030\003 \003(\t\"Q\n"
          + "\020GetDomainRequest\022=\n"
          + "\004name\030\001 \001(\tB/\340A\002\372A)\n"
          + "\'managedidentities.googleapis.com/Domain\"\213\001\n"
          + "\023UpdateDomainRequest\0224\n"
          + "\013update_mask\030\001 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\022>\n"
          + "\006domain\030\002"
          + " \001(\0132).google.cloud.managedidentities.v1.DomainB\003\340A\002\"T\n"
          + "\023DeleteDomainRequest\022=\n"
          + "\004name\030\001 \001(\tB/\340A\002\372A)\n"
          + "\'managedidentities.googleapis.com/Domain\"\221\001\n"
          + "\022AttachTrustRequest\022=\n"
          + "\004name\030\001 \001(\tB/\340A\002\372A)\n"
          + "\'managedidentities.googleapis.com/Domain\022<\n"
          + "\005trust\030\002"
          + " \001(\0132(.google.cloud.managedidentities.v1.TrustB\003\340A\002\"\237\001\n"
          + "\027ReconfigureTrustRequest\022=\n"
          + "\004name\030\001 \001(\tB/\340A\002\372A)\n"
          + "\'managedidentities.googleapis.com/Domain\022\037\n"
          + "\022target_domain_name\030\002 \001(\tB\003\340A\002\022$\n"
          + "\027target_dns_ip_addresses\030\003 \003(\tB\003\340A\002\"\221\001\n"
          + "\022DetachTrustRequest\022=\n"
          + "\004name\030\001 \001(\tB/\340A\002\372A)\n"
          + "\'managedidentities.googleapis.com/Domain\022<\n"
          + "\005trust\030\002 \001(\0132(."
          + "google.cloud.managedidentities.v1.TrustB\003\340A\002\"\223\001\n"
          + "\024ValidateTrustRequest\022=\n"
          + "\004name\030\001 \001(\tB/\340A\002\372A)\n"
          + "\'managedidentities.googleapis.com/Domain\022<\n"
          + "\005trust\030\002"
          + " \001(\0132(.google.cloud.managedidentities.v1.TrustB\003\340A\0022\362\021\n"
          + "\030ManagedIdentitiesService\022\360\001\n"
          + "\027CreateMicrosoftAdDomain\022A.google.cloud.managedidenti"
          + "ties.v1.CreateMicrosoftAdDomainRequest\032\035"
          + ".google.longrunning.Operation\"s\202\323\344\223\002:\"0/"
          + "v1/{parent=projects/*/locations/global}/"
          + "domains:\006domain\332A\031parent,domain_name,domain\312A\024\n"
          + "\006Domain\022\n"
          + "OpMetadata\022\350\001\n"
          + "\022ResetAdminPassword\022<.google.cloud.managedidentiti"
          + "es.v1.ResetAdminPasswordRequest\032=.google.cloud.managedidentities.v1.ResetAdminPa"
          + "sswordResponse\"U\202\323\344\223\002H\"C/v1/{name=projec"
          + "ts/*/locations/global/domains/*}:resetAdminPassword:\001*\332A\004name\022\277\001\n"
          + "\013ListDomains\0225.google.cloud.managedidentities.v1.ListDo"
          + "mainsRequest\0326.google.cloud.managedident"
          + "ities.v1.ListDomainsResponse\"A\202\323\344\223\0022\0220/v"
          + "1/{parent=projects/*/locations/global}/domains\332A\006parent\022\254\001\n"
          + "\tGetDomain\0223.google.cloud.managedidentities.v1.GetDomainReque"
          + "st\032).google.cloud.managedidentities.v1.D"
          + "omain\"?\202\323\344\223\0022\0220/v1/{name=projects/*/locations/global/domains/*}\332A\004name\022\332\001\n"
          + "\014UpdateDomain\0226.google.cloud.managedidentities"
          + ".v1.UpdateDomainRequest\032\035.google.longrun"
          + "ning.Operation\"s\202\323\344\223\002A27/v1/{domain.name"
          + "=projects/*/locations/global/domains/*}:\006domain\332A\022domain,update_mask\312A\024\n"
          + "\006Domain\022\n"
          + "OpMetadata\022\314\001\n"
          + "\014DeleteDomain\0226.google.cloud.managedidentities.v1.DeleteDomainReq"
          + "uest\032\035.google.longrunning.Operation\"e\202\323\344"
          + "\223\0022*0/v1/{name=projects/*/locations/global/domains/*}\332A\004name\312A#\n"
          + "\025google.protobuf.Empty\022\n"
          + "OpMetadata\022\320\001\n"
          + "\013AttachTrust\0225.google.cloud.managedidentities.v1.AttachTru"
          + "stRequest\032\035.google.longrunning.Operation"
          + "\"k\202\323\344\223\002A\"</v1/{name=projects/*/locations/global/domains/*}:attachTrust:\001*\332A\n"
          + "name,trust\312A\024\n"
          + "\006Domain\022\n"
          + "OpMetadata\022\205\002\n"
          + "\020ReconfigureTrust\022:.google.cloud.managedidentit"
          + "ies.v1.ReconfigureTrustRequest\032\035.google."
          + "longrunning.Operation\"\225\001\202\323\344\223\002F\"A/v1/{nam"
          + "e=projects/*/locations/global/domains/*}"
          + ":reconfigureTrust:\001*\332A/name,target_domain_name,target_dns_ip_addresses\312A\024\n"
          + "\006Domain\022\n"
          + "OpMetadata\022\320\001\n"
          + "\013DetachTrust\0225.google.cloud.managedidentities.v1.DetachTrustReq"
          + "uest\032\035.google.longrunning.Operation\"k\202\323\344"
          + "\223\002A\"</v1/{name=projects/*/locations/global/domains/*}:detachTrust:\001*\332A\n"
          + "name,trust\312A\024\n"
          + "\006Domain\022\n"
          + "OpMetadata\022\326\001\n\r"
          + "ValidateTrust\0227.google.cloud.managedidentities.v1.V"
          + "alidateTrustRequest\032\035.google.longrunning"
          + ".Operation\"m\202\323\344\223\002C\">/v1/{name=projects/*"
          + "/locations/global/domains/*}:validateTrust:\001*\332A\n"
          + "name,trust\312A\024\n"
          + "\006Domain\022\n"
          + "OpMetadata\032T\312A managedidentities.googleapis.com\322A"
          + ".https://www.googleapis.com/auth/cloud-platformB\222\002\n"
          + "%com.google.cloud.managedidentities.v1B\035ManagedIdentitiesServiceProto"
          + "P\001ZRgoogle.golang.org/genproto/googleapis/cloud/managedidentities/v1;managediden"
          + "tities\242\002\004GCMI\252\002!Google.Cloud.ManagedIden"
          + "tities.V1\312\002!Google\\Cloud\\ManagedIdentiti"
          + "es\\V1\352\002$Google::Cloud::ManagedIdentities::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.managedidentities.v1.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_managedidentities_v1_OpMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_managedidentities_v1_OpMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_OpMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "EndTime", "Target", "Verb", "RequestedCancellation", "ApiVersion",
            });
    internal_static_google_cloud_managedidentities_v1_CreateMicrosoftAdDomainRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_managedidentities_v1_CreateMicrosoftAdDomainRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_CreateMicrosoftAdDomainRequest_descriptor,
            new java.lang.String[] {
              "Parent", "DomainName", "Domain",
            });
    internal_static_google_cloud_managedidentities_v1_ResetAdminPasswordRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_managedidentities_v1_ResetAdminPasswordRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_ResetAdminPasswordRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_managedidentities_v1_ResetAdminPasswordResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_managedidentities_v1_ResetAdminPasswordResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_ResetAdminPasswordResponse_descriptor,
            new java.lang.String[] {
              "Password",
            });
    internal_static_google_cloud_managedidentities_v1_ListDomainsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_managedidentities_v1_ListDomainsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_ListDomainsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_managedidentities_v1_ListDomainsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_managedidentities_v1_ListDomainsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_ListDomainsResponse_descriptor,
            new java.lang.String[] {
              "Domains", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_managedidentities_v1_GetDomainRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_managedidentities_v1_GetDomainRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_GetDomainRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_managedidentities_v1_UpdateDomainRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_managedidentities_v1_UpdateDomainRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_UpdateDomainRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Domain",
            });
    internal_static_google_cloud_managedidentities_v1_DeleteDomainRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_managedidentities_v1_DeleteDomainRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_DeleteDomainRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_managedidentities_v1_AttachTrustRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_managedidentities_v1_AttachTrustRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_AttachTrustRequest_descriptor,
            new java.lang.String[] {
              "Name", "Trust",
            });
    internal_static_google_cloud_managedidentities_v1_ReconfigureTrustRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_managedidentities_v1_ReconfigureTrustRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_ReconfigureTrustRequest_descriptor,
            new java.lang.String[] {
              "Name", "TargetDomainName", "TargetDnsIpAddresses",
            });
    internal_static_google_cloud_managedidentities_v1_DetachTrustRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_managedidentities_v1_DetachTrustRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_DetachTrustRequest_descriptor,
            new java.lang.String[] {
              "Name", "Trust",
            });
    internal_static_google_cloud_managedidentities_v1_ValidateTrustRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_managedidentities_v1_ValidateTrustRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_ValidateTrustRequest_descriptor,
            new java.lang.String[] {
              "Name", "Trust",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.managedidentities.v1.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
